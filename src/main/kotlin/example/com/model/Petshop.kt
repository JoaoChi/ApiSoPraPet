package example.com.model

import kotlinx.serialization.Serializable
import org.jetbrains.exposed.sql.Table

@Serializable
data class Petshop(
    val uid: String,
    var name: String,
    var imagem: String,
    var localizacao: String,
    var descricao: String,
    var servicos: String,
    val cnpj: String
)

object Petshops : Table() {
    val uid = text("uid")
    val name = text("name")
    val imagem = text("imagem")
    val localizacao = text("localizacao")
    val descricao = text("descricao")
    val servicos = text("servicos")
    val cnpj = text("cnpj")
    override val primaryKey = PrimaryKey(uid)
}