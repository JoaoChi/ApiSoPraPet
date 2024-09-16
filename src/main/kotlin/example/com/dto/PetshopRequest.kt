package example.com.dto

import example.com.model.Petshop
import kotlinx.serialization.Serializable

@Serializable
data class PetshopRequest(
    val uid: String,
    var name: String,
    var imagem: String,
    var localizacao: String,
    var descricao: String,
    var servicos: String,
    val cnpj: String
) {
    fun toPetshop(): Petshop {
        return Petshop(
            uid = uid,
            name = name,
            imagem = imagem,
            localizacao = localizacao,
            descricao = descricao,
            servicos = servicos,
            cnpj = cnpj
        )
    }
}