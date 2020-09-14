package com.mantis.tech.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ResponseEntity<T> {

    public String responseCode;
    public String message;
    public Object[] result;
}
