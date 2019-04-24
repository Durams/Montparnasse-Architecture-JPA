package com.presentation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.metier.Adresse;
import com.metier.Client;
import com.metier.Connexion;
import com.metier.Employe;
import com.metier.Personne;
import com.service.Iservice;
import com.service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//entity manager permet de créer les tables 
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		
		Iservice service = new ServiceImpl();
		
		/*Personne p = new Personne();
		p.setNom("Bonjourmamaman");
		p.setPrenom("remi");
		p.setAge(20);
		service.ajouterPersonne(p);*/
		
		/*Employe e = new Employe();
		e.setNom("toto");
		e.setPrenom("Jojo");
		e.setAge(100);
		e.setSalaire (2000);
		service.ajouterPersonne(e);
		
		Client c = new Client();
		c.setNom("titi");
		c.setPrenom("lili");
		c.setAge(200);
		c.setNumeroAdherent(12);
		service.ajouterPersonne(c);*/
		
		
		//service.supprimerPersonne(service.getPersonne(2));
		
		//faire la méthode modifier à la maison 
		
		/*Personne p =service.affichagePersonne(3);
		System.out.println(p);*/
		
		
	//afficher la liste avec JPQL
		//System.out.println(service.findAllPersonnes());
		
		//System.out.println(service.rechercheParMC("Bonjour")); 
		
		//Volet Adresse
		
		/*Adresse a = new Adresse();
		a.setNumRue("15");
		a.setNomRue("rue paradis");
		a.setCp("ile de france");
		a.setVille("Paris");
		service.ajouterAdresse(a);
		
		Adresse b = new Adresse();
		b.setNumRue("42");
		b.setNomRue("rue aqueduc");
		b.setCp("ile de france");
		b.setVille("Paris");
		service.ajouterAdresse(b);
		
		Adresse x = new Adresse();
		x.setNumRue("221");
		x.setNomRue("rue chateau landon");
		x.setCp("ile de france");
		x.setVille("Paris");
		service.ajouterAdresse(x);
		
		Adresse y = new Adresse();
		y.setNumRue("3");
		y.setNomRue("rue de la gare");
		y.setCp("Haute loire");
		y.setVille("Tence");
		service.ajouterAdresse(y);
		*/
		//service.supprimerAdresse(service.getAdresse(2));
		
		/*Adresse a3 = service.affichageAdresse(8);
		a3.setNumRue("15");
		a3.setNomRue("rue blabla");
		a3.setCp("ile de france");
		a3.setVille("Bordeaux");
		System.out.println(service.modifierAdresse(a3));*/
		
		
		
				//faire la méthode modifier à la maison 
				
				/*Personne p =service.affichagePersonne(3);
				System.out.println(p);*/
				
				
			//afficher la liste avec JPQL
				//System.out.println(service.findAllAdresses());
				
				//System.out.println(service.rechercheParMCA("Bor")); 
				
				
				
				
				//Connexion : 
					
				/*Connexion m = new Connexion();
				m.setLogin("1988remi");
				m.setMdp("Durams");
				service.ajouterConnexion(m);
				
				Connexion h = new Connexion();
				h.setLogin("75010Remi");
				h.setMdp("Zooker");
				service.ajouterConnexion(h);
				
				Connexion i = new Connexion();
				i.setLogin("75010Remi");
				i.setMdp("Barbe");
				service.ajouterConnexion(i);
				
				Connexion s = new Connexion();
				s.setLogin("75010Remi");
				s.setMdp("Barbe");
				service.ajouterConnexion(s);*/
				
				//service.supprimerConnexion(service.getConnexion(2));
				
				/*Connexion c2 = service.affichageConnexion(3);
				c2.setLogin("123456");
				c2.setMdp("Izy");
				System.out.println(service.modifierConnexion(c2));*/
				
				
				
						//faire la méthode modifier à la maison 
						
						/*Connexion c =service.affichageConnexion(5);
						System.out.println(c);*/
						
						
					//afficher la liste avec JPQL
						//System.out.println(service.findAllConnexions());
						
						//
		
		//System.out.println(service.rechercheParMCC("1988remi")); 
		
		//Ajouet une adresse a une personne 
		
		/*Personne p = new Personne();
		Adresse a = new Adresse();
		a.setCp("75000");
		a.setNomRue("rue des lilas");
		a.setNumRue("15");
		a.setVille("Paris");
		
		p.setNom("parisien");
		p.setPrenom("Marie");
		p.setAge(25);
		p.setAdresse(a);// deux objets transient en bdd
		
		service.ajouterPersonne(p);
						
		service.supprimerAdresse(service.getAdresse(13));*///supprimer uniquement l'adresse et garde la personne
		
		
		// Visualiser les connexions avec la personne 
		/*service.ajouterPersonne(p);
		
		for (Personne pers : service.findAllPersonnesConnexion()) {
			
			System.out.println(pers + " "+ pers.getConnexion());*/
		
			//Afficher une personne avec l'adresse associé
			

		for (Personne pers : service.findAllPersonnesAdresse()) {
			
			System.out.println(pers+ " "+ pers.getAdresse());
		
		}
	}

}
