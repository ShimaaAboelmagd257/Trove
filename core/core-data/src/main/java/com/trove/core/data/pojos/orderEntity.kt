import android.os.Parcelable
import com.trove.core.data.pojos.OrderItemEntity
import kotlinx.parcelize.Parcelize
import java.time.LocalDateTime


@Parcelize
data class OrderEntity(
    val orderId: Long = 0,
    val orderItems: List<OrderItemEntity> = emptyList(),
    val totalPrice: Double,
    val status: String,
    val createdAt: LocalDateTime
) : Parcelable