
String ruta;
@Override
public void init(ServletConfig config) throws ServletEsception{
	 ruta = config.getInitParameter("ruta");
	 InitialContext context;
	 try{
	 	context = new InitialContext();
	 	Contex env = (context) context.lookup("java:comp/env");
	 	ds = (DataSource) env.lookup("jdbc/joelJar");
	 }


}