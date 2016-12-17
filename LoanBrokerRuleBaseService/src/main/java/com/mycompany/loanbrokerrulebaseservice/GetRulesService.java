package com.mycompany.loanbrokerrulebaseservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Skroget
 */
@WebService(serviceName = "GetRulesService")
public class GetRulesService {

    


    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "getRules")
    public String getRules() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("<ruleobject>");
        sb.append("<rules>");
            sb.append("<rule><min>0</min><max>500</max><banks><bank><bankNo>3</bankNo></bank><bank><bankNo>4</bankNo></bank></banks></rule>");
            sb.append("<rule><min>580</min><max>619</max><banks><bank><bankNo>3</bankNo></bank><bank><bankNo>4</bankNo></bank></banks></rule>");
            sb.append("<rule><min>580</min><max>619</max><banks><bank><bankNo>3</bankNo></bank><bank><bankNo>4</bankNo></bank></banks></rule>");
            sb.append("<rule><min>620</min><max>679</max><banks><bank><bankNo>2</bankNo></bank><bank><bankNo>3</bankNo></bank></banks></rule>");
            sb.append("<rule><min>680</min><max>719</max><banks><bank><bankNo>2</bankNo></bank><bank><bankNo>3</bankNo></bank></banks></rule>");
            sb.append("<rule><min>720</min><max>800</max><banks><bank><bankNo>1</bankNo></bank><bank><bankNo>2</bankNo></bank><bank><bankNo>3</bankNo></bank></banks></rule>");
        sb.append("</rules>");
        sb.append("</ruleobject>");
                
        return sb.toString();
   
    }
}


