package ReastAssurtTest;
import BaseForEachRequest.ReqPattern;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.List;
import static io.restassured.RestAssured.given;
public class PatternTest {
    private static Response patternRes;
    public static void getResponse(String RelatedParty)
    {
        patternRes = given()
                .spec(ReqPattern.patternReqSpecification())
                .when()
                .get(RelatedParty);
    }

    public static void ValidateResponseStatus(){
                patternRes.then()
                .spec(ReqPattern.respSpecification_Valid())
                .extract()
                .response();

    }
    public static void ValidateNumView(String QuarryParameter,String ActualValue)
    {
        int ActualNumViews = Integer.parseInt(ActualValue);
        XmlPath responseBody = patternRes.xmlPath();
        List<String> allNumViews = responseBody.getList(QuarryParameter);
        for(String numView : allNumViews)
        {
            Assert.assertTrue(Integer.parseInt(numView)>ActualNumViews);
            System.out.println(numView+" "+ActualValue);
        }
    }

}
