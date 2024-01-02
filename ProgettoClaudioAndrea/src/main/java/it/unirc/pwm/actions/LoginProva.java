package it.unirc.pwm.actions;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.Cliente;

public class LoginProva extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private Cliente cliente;

    public String execute() {
        if ("email".equals(cliente.getEmail()) && "password".equals(cliente.getPassword())) {
            return SUCCESS;
        } else {
            addActionError("Credenziali non valide");
            return ERROR;
        }
    }

    public void validate() {
        if (cliente.getEmail() == null) {
            addFieldError("email", "Il campo email è obbligatorio");
        }

        if (cliente.getPassword() == null) {
            addFieldError("password", "Il campo Password è obbligatorio");
        }
    }
}

