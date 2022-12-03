package com.j7u8a9n;
import com.j7u8a9n.dao.CocheDao;
import com.j7u8a9n.dao.ClienteDao;
import com.j7u8a9n.dao.RevisionDao;
import com.j7u8a9n.model.Cliente;
import com.j7u8a9n.model.Coche;
import com.j7u8a9n.model.Revision;
import com.j7u8a9n.util.ConectorBD;


import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Connection connection = ConectorBD.getConnection();
     Cliente clientee = new Cliente("1450","Carlos Perez","Cochabamba","Av.Ayacucho s/n",4274869);
        Cliente laura = new Cliente("1458", "Laura Perez", "Cochabamba", "Av.Ayacucho s/n", 4274869);
        Cliente roberto = new Cliente("1452", "Roberto Lopez", "Cochabamba", "Calle Junin s/n", 4745218);
        Cliente lorena = new Cliente("1453", "Lorena Paredes", "Cochabamba", "Av.Heroinas s/n", 4236598);
        Cliente jose = new Cliente("1454", "Jose Vega", "Cochabamba", "Calle Sucre s/n", 4895631);
        Cliente juan = new Cliente("1455", "Juan Vargas", "Cochabamba", "Calle Bolivar s/n", 4369410);
        Cliente pedro = new Cliente("1456-1B", "Pedro Quintero", "Cochabamba", "Av.Blanco Galindo s/n", 4789520);
        Cliente alan = new Cliente("1457", "Alan Mora", "Cochabamba", "calle calama s/n", 4362897);
        Cliente raquel = new Cliente("6598", "Raquel Pelaez", "Cochabamba", "Ciudad Del NIño", 4458963);

        //CRUD tabla clientes
         ClienteDao clienteDao = new ClienteDao();


        //CREATE
    /* clienteDao.addCliente(laura);
         clienteDao.addCliente(roberto);
        clienteDao.addCliente(lorena);
         clienteDao.addCliente(jose);
         clienteDao.addCliente(juan);
        clienteDao.addCliente(pedro);
         clienteDao.addCliente(alan);
         clienteDao.addCliente(raquel);*/

        //READ

   /*   List<Cliente> clientes= clienteDao.getAllClientes();
        for (int i=0;i<clientes.size();i++){
            Cliente cliente= clientes.get(i);

            System.out.println(cliente);
        }*/


        //UPDATE
       /* Cliente cliente1 = new Cliente("1458","Antonio Gutierrez","Cochabamba","Av.Ayacucho s/n",4274869);
        clienteDao.updateCliente(cliente1);
        Cliente cliente2= new Cliente("1455","Joel Galindo","Cochabamba","Calle Bolivar s/n",4480919);
        clienteDao.updateCliente(cliente2);*/



        //DELETE
        /*clienteDao.deleteCliente("1458");
        clienteDao.deleteCliente("1455");*/





        CocheDao cocheDao = new CocheDao();
        //Coche coche = new Coche("LHF358","Toyota","Corolla","azul marino",12000,laura);
        Coche coche1 = new Coche("594NFP", "Nissan", "Murano", "Rojo", 16000, laura);
        Coche coche2 = new Coche("LHF1835", "Toyota", "Corrolla", "Plateado", 12000, juan);
        Coche coche3 = new Coche("LKO7895", "Ford", "B-Max", "Verde", 20000, alan);
        Coche coche4 = new Coche("IYO789", "Jeep", "Cherokee", "Negro", 25000, roberto);
        Coche coche5 = new Coche("POT7821", "BMW", "BMW-X5", "Blanco", 40000, jose);
        Coche coche6 = new Coche("NKO1239", "Mistubishi", "ASX", "Amarillo", 35000, lorena);
        Coche coche7 = new Coche("UBE6944", "Subaru", "New-XV", "Negro", 45000, pedro);
        Coche coche8 = new Coche("LOL5698", "Ferrari", "296-GTS", "AZUL GRIS", 600000, raquel);
        // AÑADIR LOS COCHES
       /* cocheDao.addCoche(coche1);
        cocheDao.addCoche(coche2);
        cocheDao.addCoche(coche3);
        cocheDao.addCoche(coche4);
        cocheDao.addCoche(coche5);
        cocheDao.addCoche(coche6);
        cocheDao.addCoche(coche7);
        cocheDao.addCoche(coche8);*/


        //UPDATE
       /* Coche cocheNuevo1= new Coche("IYO789","Hyundai","Corolla","Verde y Blanco",60000,juan);
        cocheDao.updateCoche(cocheNuevo1);
        Coche cocheNuevo2= new Coche("UBE6944","Suzuki","Swift Hibrido","Marron",25000,lorena);
         cocheDao.updateCoche(cocheNuevo2);*/

        //DELETE
        /* cocheDao.deleteCoche("LOL5698");
         cocheDao.deleteCoche("POT7821");
         cocheDao.deleteCoche("LKO7895");*/




        //READ
       /* List<Coche> coches = CocheDao.getALLCoches();
        for (int i=0;i<coches.size();i++){
            Coche coche = coches.get(i);
            System.out.println(coche);*/

        RevisionDao revisionDao = new RevisionDao();
        Revision revision1 = new Revision("1111", "Stark", "Brava", "1 delantero", coche1);
        Revision revision2 = new Revision("2222", "Ridex", " Shell", "2 traseros", coche2);
        Revision revision3 = new Revision("3333", "K&N", "Castrol", "1 trasero", coche3);
        Revision revision4 = new Revision("4444", "Bosch", "Daily", "2 delanteros", coche4);
        Revision revision5 = new Revision("5555", "Mapco", "Havoline", "1 trasero", coche5);
         Revision revision6 = new Revision("6666","Blueprint","Hot Rod","2 traseros",coche6);
        Revision revision7 = new Revision("7777","Knecht","STP","2 delanteros",coche7);
         Revision revision8 = new Revision("8888","Mann-Filter","Acdelco","1 trasero",coche8);

       // AÑADIR REVISIONES
      /*  revisionDao.addRevision(revision1);
        revisionDao.addRevision(revision2);
        revisionDao.addRevision(revision3);
        revisionDao.addRevision(revision4);
        revisionDao.addRevision(revision5);
         revisionDao.addRevision(revision6);
        revisionDao.addRevision(revision7);
        revisionDao.addRevision(revision8);*/


        //Update
        /*Revision revisionNueva = new Revision("2222", "Purflux", "Penzzoil", "las 4 llantas", coche3);
        revisionDao.updateRevision(revisionNueva);
        Revision revisionNueva1 = new Revision("5555", "Mahle ", "Acdelco", "2 delanteras y 1 trasera", coche5);
        revisionDao.updateRevision(revisionNueva1);*/

        //Delete
        /*revisionDao.deleteRevision("5555");//6666
        revisionDao.deleteRevision("2222");//8888
        revisionDao.deleteRevision("8888");//1111*/



        //READ

       /* List<Revision> revisiones = revisionDao.getAllRevisiones();
        for (int i = 0 ; i<revisiones.size();i++) {
            Revision revision = revisiones.get(i);
            System.out.println(revision);*/

        }
    }

