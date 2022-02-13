import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {
    private final String name;
    private final boolean expected;

    public AccountTest(String name, boolean expected){
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getName(){
        return new Object[][]{
                {"Тимоти Шаламе", true},
                {"Тимоти Шаламетесттт", true},
                {"Т Ш", true},
                {"ТимотиШаламе", false},
                {"ТимотиШаламе ", false},
                {" ТимотиШаламе", false},
                {"Тимотиаламе Тимотиаламе", false},
                {"Ти", false},
                {"Тимоти Шал аме", false},
                {null , false},
        };
    }

    @Test
    @DisplayName("checkNameToEmboss method")
    @Description("check checkNameToEmboss method the method return true or false")
    public void checkNameToEmbossTrueFalse(){
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }

}
