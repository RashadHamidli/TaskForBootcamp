package com.company.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
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
