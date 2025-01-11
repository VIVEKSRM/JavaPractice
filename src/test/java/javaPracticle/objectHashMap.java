package javaPracticle;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class objectHashMap {
    @Test
    public void ObjectsInHashMap() {
/* Json like below
{
    "name":"Learn Api"
    "isbn":"bcd"
    "aisle":"227"
    "author":"jhon fee"
 }
    */
        HashMap<String, Object> hm = new HashMap<>();
        hm.put("name", "Learn Api");
        hm.put("isbn", "btd");
        hm.put("aisle", 250);
        hm.put("author", "jhon fee");
/*in case of nested array we can put map into another map
* {
    "name":"Learn Api"
    "isbn":"bcd"
    "aisle":"227"
    "location":{
     "lat": "-3453"
     "lng": "33.456322"
        }
        * */

    //in above case do like below
        HashMap<String, Object> hm2 = new HashMap<>();
        hm2.put("lat", "-3453");
        hm2.put("lng", "33.456322");

        HashMap<String, Object> hm3 = new HashMap<>();
        hm3.put("age",45);
        hm3.put("country", "US");
        hm3.put("id", 76);

      //  HashMap<String, Object> hm4 = new HashMap<>();

   //in main Hash map add it like below
        hm.put("location", hm2);
        hm.put("ram", hm3);

        Iterator itr=hm.entrySet().iterator();


        while(itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();

            System.out.println(me.getKey()+" value :-" +me.getValue());
          //  hm4.putAll((Map<? extends String, ?>) me.getValue());
         //   System.out.println("hm4: "+hm4);
            if(me.getValue().equals("id")){
                System.out.println("testing sucess" +me.getKey()+" value :-" +me.getValue());
            }

        }

        System.out.println(hm);
    }
}
