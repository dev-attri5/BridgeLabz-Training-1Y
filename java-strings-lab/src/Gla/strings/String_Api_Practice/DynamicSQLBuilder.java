package Gla.strings.String_Api_Practice;

public class DynamicSQLBuilder{
    StringBuilder query = new StringBuilder("SELECT ");
    public void addColumn(String col){ query.append(col).append(", "); }
    public void from(String table){ query.append("FROM ").append(table).append(" "); }
    public void where(String cond){ query.append("WHERE ").append(cond).append(" "); }
    public void orderBy(String col){ query.append("ORDER BY ").append(col).append(" "); }
    public void limit(int n){ query.append("LIMIT ").append(n); }
    public void build(){ System.out.println(query.toString()); }
    public static void main(String[] args){
        DynamicSQLBuilder q = new DynamicSQLBuilder();
        q.addColumn("id"); q.addColumn("name");
        q.from("users");
        q.where("age>18");
        q.orderBy("name ASC");
        q.limit(10);
        q.build();
    }
}
