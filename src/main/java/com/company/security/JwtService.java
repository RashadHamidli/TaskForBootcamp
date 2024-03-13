package com.company.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class JwtService {
    @Value("${spring.jwt.secret.key}")
    private String SECRET_KEY;
    @Value("${spring.jwt.issuer}")
    private String ISSUER;
    @Value("${spring.jwt.expires}")
    private String EXPIRES;

    public String findUsername(String token){
        return decodedToken(token).getSubject();
    }
    public DecodedJWT decodedToken(String token){
        try {
            return JWT.require(Algorithm.HMAC256(SECRET_KEY)).build().verify(token);
        }catch (Exception e){
            e.getMessage();
            return null;
        }
    }
    public boolean validateToken(String token){
       try {
           JWT.require(Algorithm.HMAC256(SECRET_KEY)).build().verify(token);
           return true;
       }catch (JWTVerificationException e){
           e.getMessage();
           return false;
       }
    }

    public String generateToken(UserDetails userDetails) {
        return JWT.create()
                .withIssuer(ISSUER)
                .withSubject(userDetails.getUsername())
                .withClaim("email", userDetails.getUsername())
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRES))
                .withJWTId(UUID.randomUUID().toString())
                .withNotBefore(new Date(System.currentTimeMillis() + 1000L))
                .sign(Algorithm.HMAC256(SECRET_KEY));
    }

}
