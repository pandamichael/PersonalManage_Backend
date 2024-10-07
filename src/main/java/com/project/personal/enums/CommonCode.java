package com.project.personal.enums;

import com.project.personal.exception.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommonCode {

    /**
     * 成功
     */
    SUCCESS(1000, "success"),
    /**
     * 其他異常
     */
    ERROR(-9999, "500 ERROR"),
    /**
     * {@link DataNotFindException}
     */
    N2001(-2001, "查無資料[%s]"),
    /**
     * {@link AbnormalDataException}
     */
    N2002(-2002, "資料異常[%s]"),
    /**
     * {@link RequestDataFormatException}
     */
    N2003(-2003, "請求參數錯誤[%s]"),
    /**
     * {@link RequiredParameterMissingException}
     */
    N2004(-2004, "缺少必填參數[%s]"),


    N3001(-3001, "帳號不存在"),
    N3002(-3002, "密碼錯誤"),
    N3003(-3003, "Session 驗證失敗，請重新登入"),
    N3004(-3004, "信箱已存在");


    private final Integer code;

    private String message;

    public String makeMessage(Object[] args) {
        message = this.getMessage();
        if (message != null && args != null) {
            message = String.format(message, args);
        } else if (message != null && message.contains("%s")) {
            message = message.replace("%s", "");
        }
        return message;
    }
}
