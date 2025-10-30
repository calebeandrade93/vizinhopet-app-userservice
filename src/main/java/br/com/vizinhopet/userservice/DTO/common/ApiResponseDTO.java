package br.com.vizinhopet.userservice.DTO.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ApiResponseDTO<T>{

    private String message;
    private T data;

}
