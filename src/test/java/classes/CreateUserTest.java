package classes;

import common.TestsConfigurator;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateUserTest {

    private static final String ID_NAME = "nome";
    private static final String NAME = "Maria Francisca Silva";
    private static final String ID_CPF = "cpf";
    private static final String ID_EMAIL = "email";
    private static final String EMAIL = "mfsilva@teste.com.br";
    private static final String ID_PASSWORD = "senha";
    private static final String PASSWORD = "123456";
    private static final String ID_CONFIRM_PASSWORD = "confirmar";
    private static final String CONFIRM_PASSWORD = "123456";
    private static final String LOGIN_BUTTON = "submit";
    private static final String CLASS_MESSAGE_ERROR_DUPLICATED_REGISTER = "validate-error-msg";
    private static final String MESSAGE_ERROR_DUPLICATED_REGISTER = "O usuário informado já existe";


    private static String calcDigVerif(String num) {

        Integer primeiroDigito;
        Integer segundoDigito;
        int soma = 0;
        int peso = 10;

        for (int i = 0; i < num.length(); i++)
            soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;

        if (soma % 11 == 0 | soma % 11 == 1)
            primeiroDigito = new Integer(0);
        else
            primeiroDigito = new Integer(11 - (soma % 11));

        soma = 0;
        peso = 11;

        for (int i = 0; i < num.length(); i++)
            soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;

        soma += primeiroDigito.intValue() * 2;
        if (soma % 11 == 0 | soma % 11 == 1)
            segundoDigito = new Integer(0);
        else
            segundoDigito = new Integer(11 - (soma % 11));

        return primeiroDigito.toString() + segundoDigito.toString();
    }
}
