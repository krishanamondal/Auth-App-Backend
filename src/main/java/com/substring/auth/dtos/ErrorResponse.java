<<<<<<< HEAD
package com.substring.auth.dtos;

import org.springframework.http.HttpStatus;

public record ErrorResponse(
        String message,
        HttpStatus status,
        int statusCode
) {
}
=======
package com.substring.auth.dtos;

import org.springframework.http.HttpStatus;

public record ErrorResponse(
        String message,
        HttpStatus status,
        int statusCode
) {
}
>>>>>>> origin/resolve-refresh-cookie
