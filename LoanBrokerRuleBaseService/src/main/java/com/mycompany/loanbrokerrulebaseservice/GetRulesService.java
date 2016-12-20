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
        sb.append("<RuleObject>");
            sb.append("<rule><min>0</min><max>500</max><bank><bankno>3</bankno></bank><bank><bankno>4</bankno></bank></rule>");
            sb.append("<rule><min>580</min><max>619</max><bank><bankno>3</bankno></bank><bank><bankno>4</bankno></bank></rule>");
            sb.append("<rule><min>580</min><max>619</max><bank><bankno>3</bankno></bank><bank><bankno>4</bankno></bank></rule>");
            sb.append("<rule><min>620</min><max>679</max><bank><bankno>2</bankno></bank><bank><bankno>3</bankno></bank></rule>");
            sb.append("<rule><min>680</min><max>719</max><bank><bankno>2</bankno></bank><bank><bankno>3</bankno></bank></rule>");
            sb.append("<rule><min>720</min><max>800</max><bank><bankno>1</bankno></bank><bank><bankno>2</bankno></bank><bank><bankno>3</bankno></bank></rule>");
        sb.append("</RuleObject>");
                
        return sb.toString();
   
    }
}


