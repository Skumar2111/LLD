package main.java.com.example.park_sure.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import lombok.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JwtUtil {

    public String extractUsername(String token) {
        return Jwts.parser().setSigningKey("mysecretkey").parseClaimsJws(token)
                .getBody().getSubject();
    }

    public List<String> extractRoles(String token) {
        Claims claims = Jwts.parser().setSigningKey("mysecretkey").parseClaimsJws(token).getBody();
        return claims.get("roles", List.class);  // Assuming you store roles
    }

    public boolean isTokenValid(String token) {
        try {
            Jwts.parser().setSigningKey("mysecretkey").parseClaimsJws(token);
            return true;
        } catch (JwtException e) {
            return false;
        }
    }
}
