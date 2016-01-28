package fr.android.androidexercises;

import junit.framework.Assert;

import org.assertj.android.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.shadows.ShadowToast;

@RunWith(CustomRobolectricTestRunner.class)
public class LoginActivityTest {

    LoginActivity activity;
    @Before
    public void setUp() throws Exception {
        activity = Robolectric.setupActivity(LoginActivity.class);
    }


    @Test
    public void testNotLogged() throws Exception {
        Assertions.assertThat(activity.loginLayout).isVisible();
        Assertions.assertThat(activity.loggedText).isGone();
    }

    @Test
    public void testMessage() throws Exception {
        activity.message(R.string.action_login);
        //then
        String textToast = ShadowToast.getTextOfLatestToast();
        Assert.assertEquals(textToast, "log me in");
    }


    @Test
    public void should_set_logged_state() throws Exception
    {
        // Given
        // When
        activity.logged();
        // Then
        Assertions.assertThat(activity.loginLayout).isGone();
        Assertions.assertThat(activity.loggedText).isVisible();
    }

}
