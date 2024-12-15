package com.bookshop.protectedcontroller;
/*
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProtectedController {

    @GetMapping("/protected")
    public ResponseEntity<String> getProtectedContent(@RequestHeader("Authorization") String authHeader) {
        String token = authHeader.replace("Bearer ", "");

        // 在这里验证token
        if (/* token验证成功 *//*) {
          return ResponseEntity.ok("Protected content");
        } else {
            return ResponseEntity.status(401).body("Unauthorized");
        }
    }
}
*/