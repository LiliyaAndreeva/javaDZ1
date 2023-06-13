public class Sem2DZ {
    public static void main(String[] args) {
//        Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE
//        этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
//                Если значение null, то параметр не должен попадать в запрос.
//        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        StringBuilder sql = new StringBuilder("select * from students where ");
        String s = "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"";
        sql.append(getWhere(s));
        System.out.println(sql);
    }
    public static String getWhere(String json) {
        json = json.replace("\"", "");
        json = json.replace("{", "");
        json = json.replace("}", "");
        String [] array = json.split(", ");
        StringBuilder where = new StringBuilder();
        for (String object: array) {
            String[] objarray = object.split(":");
            if (objarray[1].equals("null")){
                continue;
            }
            String newObject = String.format(" and %s = '%s'", objarray[0], objarray[1]);
            where.append(newObject);
        }
        where.delete(0,4);
        return where.toString();
    }

}
