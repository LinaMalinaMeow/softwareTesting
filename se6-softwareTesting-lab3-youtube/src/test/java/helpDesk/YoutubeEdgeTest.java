package helpDesk;

import core.BaseSeleniumEdgeTest;
import helpDesk.auth.AuthPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YoutubeEdgeTest extends BaseSeleniumEdgeTest {

    @Test
    public void checkSearchTest() {
        String query = "Лью воду 10 часов";
        MainPage mainPage = new MainPage();
        mainPage.createQuery(query);
    }

    @Test
    public void goToShortsTest() throws InterruptedException {
        String login = "89198776750";
        String password = "EdaVkysnaya69!";
        AuthPage authPage = new AuthPage();
        authPage.auth(login)
                .inputPassword(password)
                .goToShorts();
    }

    @Test
    public void checkSearch() {
        String query = "Лью воду 10 часов";
        MainPage mainPage = new MainPage();
        mainPage.createQuery(query);
    }

    @Test
    public void authTest() throws InterruptedException {
        String login = "89198776750";
        String password = "EdaVkysnaya69!";
        AuthPage authPage = new AuthPage();
        authPage.auth(login)
                .inputPassword(password);
    }

    @Test
    public void likeTest() throws InterruptedException {
        String login = "89198776750";
        String password = "EdaVkysnaya69!";
        AuthPage authPage = new AuthPage();
        authPage.auth(login)
                .inputPassword(password)
                .likeVideo();
    }

    @Test
    public void subscribeTest() throws InterruptedException {
        String login = "89198776750";
        String password = "EdaVkysnaya69!";
        AuthPage authPage = new AuthPage();
        authPage.auth(login)
                .inputPassword(password)
                .subscribeToChannel();
    }

    @Test
    public void profileNameTest() throws InterruptedException {
        String login = "89198776750";
        String password = "EdaVkysnaya69!";
        AuthPage authPage = new AuthPage();
        String profileName = authPage.auth(login)
                .inputPassword(password)
                .getProfileName();
        assertEquals("Еда Вкусная", profileName, "Имена должны совпадать");
    }

    @Test
    public void authWithWrongsTest() throws InterruptedException {
        String login = "authWithWrongs";
        AuthPage authPage = new AuthPage();
        String error = authPage.authWithWrongs(login);
        assertEquals("Не удалось найти аккаунт Google.", error);
    }
}
