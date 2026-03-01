package test;

import entities.Client;
import entities.Vehicule;
import entities.Reparation;

import service.ClientService;
import service.VehiculeService;
import service.ReparationService;

import java.time.LocalDate;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        ClientService clientService = new ClientService();
        VehiculeService vehiculeService = new VehiculeService();
        ReparationService reparationService = new ReparationService();

        try {

         
            System.out.println("=== AJOUT CLIENTS ===");

            clientService.create(new Client(0,"Ahmed","0600000000"));
            clientService.create(new Client(1,"Sara","0611111111"));
            clientService.create(new Client(2,"Karim","0622222222"));

            List<Client> clients = clientService.findAll();
            System.out.println("Nombre clients: " + clients.size());

            if (clients.isEmpty()) return;

          
            System.out.println("\n=== AJOUT VEHICULES ===");

            vehiculeService.create(new Vehicule(
                    0,
                    "123-A-45",
                    "Toyota",
                    "Corolla",
                    null,
                    clients.get(0).getId()
            ));

            vehiculeService.create(new Vehicule(
                    1,
                    "456-B-78",
                    "Renault",
                    "Clio",
                    null,
                    clients.get(1).getId()
            ));

            List<Vehicule> vehicules = vehiculeService.findAll();
            System.out.println("Nombre vehicules: " + vehicules.size());

            if (vehicules.isEmpty()) return;

         
            System.out.println("\n=== AJOUT REPARATIONS ===");

            Reparation r1 = new Reparation();
            r1.setVehiculeId(vehicules.get(0).getId());
            r1.setType("Changement moteur");
            r1.setDate(LocalDate.now());
            r1.setCout(3500);
            reparationService.create(r1);
            

            Reparation r2 = new Reparation();
            r2.setVehiculeId(vehicules.get(1).getId());
            r2.setType("Freins");
            r2.setDate(LocalDate.now());
            r2.setCout(800);
            reparationService.create(r2);

            List<Reparation> reparations = reparationService.findAll();
            System.out.println("Nombre réparations: " + reparations.size());

            System.out.println("\n✅ BASE DE DONNÉES REMPLIE AVEC SUCCÈS");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}