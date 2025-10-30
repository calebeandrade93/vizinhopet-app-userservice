package br.com.vizinhopet.userservice.DTO.request;

import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.*;

import java.util.Date;

@Getter
@Setter
public class PartUserDTO {

    @NotBlank(message = "Nome completo é obrigatório")
    private String userFullName;

    @NotNull(message = "Data de nascimento é obrigatória")
    @Past(message = "Data de nascimento deve ser no passado")
    private Date dateBirth;

    @NotBlank(message = "Telefone é obrigatório")
    @Pattern(regexp = "\\d{10,11}", message = "Telefone deve conter 10 ou 11 dígitos")
    private String phoneNumber;

    @Email(message = "Email inválido")
    @NotBlank(message = "Email é obrigatório")
    private String email;

    @NotBlank(message = "Whatsapp é obrigatório")
    @Pattern(regexp = "\\d{10,11}", message = "Telefone deve conter 10 ou 11 dígitos")
    private String wtsappNumber;

}
