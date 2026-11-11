package varios;

public class TextBlock {
	public static void main(String[] args) {
		String sql =
		"""
		select * from empleados
		  left join departamentos on ...
		  where salario > 1000
		  group by...
		""";
		
		System.out.println(sql);
	}
}
