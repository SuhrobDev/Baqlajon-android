package uz.rounded.baqlajon.domain.model.main.course

data class FreeVideoModel(
    val _id: String,
    val courseId: String,
    val createdAt: String,
    val description: String,
    val imageUrl: String,
    val index: Int,
    val isFree: Boolean,
    val title: String,
    val updatedAt: String,
    val videoUrl: String,
    val viewCount: Int
)