import android.os.Parcelable
import com.trove.core.data.pojos.CartItemEntity
import kotlinx.parcelize.Parcelize

@Parcelize
data class CartEntity(
    val cartId: Long = 0,
    val totalPrice: Double,
    val createdAt: String,
    val cartItems: List<CartItemEntity>
) : Parcelable