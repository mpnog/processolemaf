package classes;

import common.TestsConfigurator;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserAuthenticatorTest extends TestsConfigurator {

    private static final String ID_CPF = "cpf";
    private static final String USER_CPF = "089.326.876-33";
    private static final String ID_PASSWORD = "password";
    private static final String USER_PASSWORD_SUCCESS = "123456";
    private static final String USER_PASSWORD_INVALID = "123457";
    private static final String LOGIN_BUTTON = "input-entrar link-btn";
    private static final String CLASS_ELEMENT_PAGE_LOGIN = "conteudo-pagina-desc-texto";
    private static final String MESSAGE_SUCCESS_LOGIN = "Seja bem-vindo ao Sistema de Gestão de Recursos Humanos do LEMAF!";
    private static final String CLASS_MESSAGE_ERROR_LOGIN_INVALID = "response-msg";
    private static final String MESSAGE_ERROR_LOGIN_INVALID = "Usuário ou senha inválidos!";

    @Test
    public void runSuccessfullUserAuthentication() throws InterruptedException {
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.name(ID_CPF)));

        //Informing user CPF
        driver.findElement(By.name(ID_CPF)).sendKeys(USER_CPF);

        //Informing user password
        driver.findElement(By.name(ID_PASSWORD)).sendKeys(USER_PASSWORD_SUCCESS);
        driver.findElement(By.name(ID_PASSWORD)).sendKeys(Keys.ENTER);

        //Clicking on the login button
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.className(CLASS_ELEMENT_PAGE_LOGIN)));
        Assert.assertEquals(MESSAGE_SUCCESS_LOGIN, driver.findElement(By.className(CLASS_ELEMENT_PAGE_LOGIN)).getText());

    }

    @Test
    public void testInvalidData() {
        /*
         * Testing the input of wrong login information
         */

        new WebDriverWait( driver, 60).until(ExpectedConditions.visibilityOfElementLocated( By.name(ID_CPF)));

        //Informing user CPF
        driver.findElement( By.name(ID_CPF) ).sendKeys(USER_CPF);

        //Informing user password
        driver.findElement( By.name( ID_PASSWORD ) ).sendKeys(USER_PASSWORD_INVALID);
        driver.findElement( By.name( ID_PASSWORD ) ).sendKeys( Keys.ENTER );

        //Clicking on the login button
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.className(CLASS_MESSAGE_ERROR_LOGIN_INVALID)));
        Assert.assertEquals(MESSAGE_ERROR_LOGIN_INVALID, driver.findElement(By.className(CLASS_MESSAGE_ERROR_LOGIN_INVALID)).getText());

    }
}
