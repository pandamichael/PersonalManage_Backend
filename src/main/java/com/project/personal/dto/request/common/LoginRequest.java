
package com.project.personal.dto.request.common;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {

    @NotBlank
    @Schema(description = "email，登入帳號，需驗證輸入資料為 email 格式")
    private String email;

    @NotBlank
    @Schema(description = "密碼【8-12碼，至少包含一個小寫英文、大寫英文、數字】")
    private String password;

}
