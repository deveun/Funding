package com.flab.funding.common.utils;

import com.flab.funding.common.model.BasicResponse;
import com.flab.funding.common.model.ErrorEntity;

public class ResponseUtil {
    public static <T> BasicResponse<T> success(T response) {
        return new BasicResponse<> (true, response, null);
    }
    public static BasicResponse<?> error(ErrorEntity e) {
        return new BasicResponse<> (false, null, e);
    }
}
