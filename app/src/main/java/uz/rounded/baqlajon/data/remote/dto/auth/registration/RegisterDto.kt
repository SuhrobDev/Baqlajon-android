package uz.rounded.baqlajon.data.remote.dto.auth.registration

data class RegisterDto(
    val firstName: String,
    val image: String? = null,
    val lastName: String,
    val promocode: String,
    val password: String,
    val phoneNumber: String
)