package model;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public interface metodosGenericosDAO {
	String consultaNomeClasse();
	ArrayList<Object> consultaDados();
	ArrayList<String> consultaOrdemDados();
	void setStatement(PreparedStatement stmt);
}
