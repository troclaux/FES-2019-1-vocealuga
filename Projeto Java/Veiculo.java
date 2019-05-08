import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Veiculo implements metodosGenericosDAO {

    private String modelo;
    private Cliente locador;
    private char tipo;
    private String marca;
    private String placa;
    private String filial;


    private ArrayList<Object> dadosVeiculo = new ArrayList<Object>();
    private ArrayList<String> ordemDadosVeiculo = new ArrayList<String>();


    public Veiculo(String modelo, Cliente locador, char tipo, String marca, String placa, String filial) {
        this.modelo = modelo;
        this.locador = locador;
        this.tipo = tipo;
        this.marca = marca;
        this.placa = placa;
        this.filial = filial;

        this.dadosVeiculo.add(modelo);
        this.dadosVeiculo.add(locador);
        this.dadosVeiculo.add(tipo);
        this.dadosVeiculo.add(marca);
        this.dadosVeiculo.add(placa);
        this.dadosVeiculo.add(filial);

        this.ordemDadosVeiculo.add("modelo");
        this.ordemDadosVeiculo.add("locador");
        this.ordemDadosVeiculo.add("tipo");
        this.ordemDadosVeiculo.add("marca");
        this.ordemDadosVeiculo.add("placa");
        this.ordemDadosVeiculo.add("filial");
    }

    //retorna a disponibilidade do veículo que o cliente desejar
    boolean checaDisponibilidade() {


        return true;
    }


    //cria uma reserva para o veiculo, se retornar true é porque o processo executou sem problemas
    boolean criaReserva() {


        return true;
    }


    @Override
    public String consultaNomeClasse() {
        return "veiculo";
    }
    @Override
    public ArrayList<Object> consultaDados() {
        return this.dadosVeiculo;
    }
    @Override
    public ArrayList<String> consultaOrdemDados() {
        return this.ordemDadosVeiculo;
    }
    @Override
    public void setStatement(PreparedStatement stmt) {
        try {
            stmt.setString(1,this.modelo);
            stmt.setCliente(2, this.locador);
            stmt.setchar(3, this.tipo);
            stmt.setString(4,this.marca);
            stmt.setString(5,this.placa);
            stmt.setString(6,this.filial);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }






}




