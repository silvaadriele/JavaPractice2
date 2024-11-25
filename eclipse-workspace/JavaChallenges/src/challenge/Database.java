package challenge;
/*O objetivo do teste é trazer um subconjunto de itens de uma tabela interna (carregada na memória) em ABAP.

Para isso, temos o exemplo das tabelas de banco de dados BKPF e BSEG.
A tabela BKPF possui em sua chave os campos:
bukrs (company code)
belnr (document number)
gjahr (fiscal year)
Cada linha da BKPF se relaciona com os seus itens na BSEG pela chave, onde a chave da BSEG tem os mesmos campos anteriores da BKPF e, 
além deles, possui o campo buzei (item number).
Considere que a BSEG possui itens de todos os documentos da BKPF. E que cada linha da BKPF tem uma relação de 1:N com a BSEG.
Complete o código do método find_document_items para retornar apenas os itens relevantes da tabela document_items relacionados ao
document_header.



METHOD find_document_items
IMPORTING
document_header TYPE TABLE OF bkpf
document_items TYPE TABLE OF bseg

lt_result TYPE TABLE OF bseg


METHOD find_document_items.
 LOOP AT document_header INTO ls_bkpf
	LOOP AT document_items INTO ls_bseg
		WHERE bukrs = ls_bkpf-bukrs
			AND belnr = ls_bkpf-belnr
			AND gjahr = ls_bkpf-gjahr.
		APPEND ls_bseg TO lt_result.
	ENDLOOP.
ENDLOOP
ENDMETHOD.*/
public class Database {
	
}

