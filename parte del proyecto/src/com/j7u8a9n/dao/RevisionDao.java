package com.j7u8a9n.dao;

import com.j7u8a9n.model.Coche;
import com.j7u8a9n.model.Cliente;
import com.j7u8a9n.model.Revision;
import com.j7u8a9n.util.ConectorBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RevisionDao {

    private Connection connection;

    public RevisionDao(){
        connection = ConectorBD.getConnection();
    }

    public void addRevision (Revision revision){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO revisiones (codigo,filtro,frenos,aceite,matricula) VALUES (?,?,?,?,?)"
            );
            preparedStatement.setString(1,revision.getCodigo());
            preparedStatement.setString(2,revision.getFiltro());
            preparedStatement.setString(3,revision.getFrenos());
            preparedStatement.setString(4,revision.getAceite());
            preparedStatement.setString(5, revision.getCoche().getMatricula());
            preparedStatement.executeUpdate();
            System.out.println(revision+" creada");
        } catch (SQLException e){
            System.out.println("Error al crear la revision" + e.getMessage());
        }
    }
    public void updateRevision (Revision revision){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE revisiones SET codigo=?,filtro=?,frenos=?,aceite=?,matricula=? WHERE codigo=?"
            );
            preparedStatement.setString(1, revision.getCodigo());
            preparedStatement.setString(2,revision.getFiltro());
            preparedStatement.setString(3,revision.getFrenos());
            preparedStatement.setString(4,revision.getAceite());
            preparedStatement.setString(5,revision.getCoche().getMatricula());

            preparedStatement.setString(6,revision.getCodigo());
            preparedStatement.executeUpdate();
            System.out.println(revision+" editado");
        } catch (SQLException e){
            System.out.println("Error al editar la revision" + e.getMessage());
        }
    }

    public void deleteRevision (String codigo){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "DELETE FROM revisiones WHERE codigo=?"
            );
            preparedStatement.setString(1,codigo);
            preparedStatement.executeUpdate();
            System.out.println(codigo+" eliminado");
        } catch (SQLException e){
            System.out.println("Error al eliminar la revision" + e.getMessage());
        }
    }

    public List<Revision> getAllRevisiones(){
        List<Revision>revisiones = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM revisiones");
            while (resultSet.next()){
                Revision revision = new Revision();
                revision.setCodigo(resultSet.getString("codigo"));
                revision.setFiltro(resultSet.getString("filtro"));
                revision.setFiltro(resultSet.getString("frenos"));
                revision.setFiltro(resultSet.getString("aceite"));
                String matricula = resultSet.getString("matricula");
                PreparedStatement preparedStatement = connection.prepareStatement(
                        "SELECT * FROM coches WHERE matricula = ?"
                );

                preparedStatement.setString(1,matricula);
                ResultSet resultSet1 = preparedStatement.executeQuery();
                while (resultSet1.next()){
                    Coche coche = new Coche();
                    coche.setMatricula(resultSet1.getString("matricula"));
                    coche.setMarca(resultSet1.getString("marca"));
                    coche.setModelo(resultSet1.getString("modelo"));
                    coche.setColor(resultSet1.getString("color"));
                    coche.setPrecio(resultSet1.getDouble("precio"));

                    String nif = resultSet1.getString("nif");
                    PreparedStatement preparedStatement1 = connection.prepareStatement(
                            "SELECT * FROM clientes WHERE nif = ?"
                    );
                    preparedStatement1.setString(1,nif);
                    ResultSet resultSet2 = preparedStatement1.executeQuery();
                    while (resultSet2.next()){
                        Cliente cliente = new Cliente();
                        cliente.setNif(resultSet2.getString("nif"));
                        cliente.setNombre(resultSet2.getString("nombre"));
                        cliente.setCiudad(resultSet2.getString("ciudad"));
                        cliente.setDireccion(resultSet2.getString("direccion"));
                        cliente.setTelefono(resultSet2.getInt("telefono"));
                        coche.setCliente(cliente);
                    }
                    revision.setCoche(coche);
                }
                revisiones.add(revision);
            }
        }catch (SQLException e){
            System.out.println("Error al listar los REVISIONES: "+ e.getMessage());
        }
        return revisiones;
    }

}