package main.spring.dio.service;

/**
 * Client HTTP para consumo do VIACEP
 * @author falvojr
 */

 @FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    
    @GetMapping("/{cep}/json/");
	Endereco consultarCep(@PathVariable("cep") String cep);
}
