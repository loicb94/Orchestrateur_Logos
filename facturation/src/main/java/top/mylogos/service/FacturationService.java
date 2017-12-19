package top.mylogos.service;

import javax.jws.WebService;

import top.mylogos.entity.Commande;
import top.mylogos.entity.Utilisateur;

@WebService
public interface FacturationService {

	public int responseFacturation(Commande commande, Utilisateur utilisateur);

}
