package top.mylogos.service;

import javax.jws.WebService;

import top.mylogos.entity.DemandePaiement;
import top.mylogos.entity.ReponsePaiement;

@WebService
public interface BanqueService {

	public ReponsePaiement demanderPaiement(DemandePaiement demande);
}
