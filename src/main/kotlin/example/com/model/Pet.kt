package example.com.model

import kotlinx.serialization.Serializable
import org.jetbrains.exposed.sql.Table

@Serializable
data class Pet(
    val id: String,
    var name: String,
    var descricao: String,
    var peso: String,
    var idade: String,
    var imagem: String
)

object Pets : Table() {
    val id = text("id")
    val name = text("name")
    val descricao = text("descricao")
    val peso = text("peso")
    val idade = text("idade")
    val imagem = text("imagem")

    override val primaryKey = PrimaryKey(id)
}