package com.codechacha.mediastore


import android.net.Uri
import androidx.recyclerview.widget.DiffUtil
import java.util.Date

/**
 * Simple data class to hold information about an image included in the device's MediaStore.
 */
data class MediaStoreImage(
    val id: Long,
    val displayName: String,
    val dateTaken: Date,
    val contentUri: Uri
) {
    companion object {
        val DiffCallback = object : DiffUtil.ItemCallback<MediaStoreImage>() {
            override fun areItemsTheSame(oldItem: MediaStoreImage, newItem: MediaStoreImage) =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: MediaStoreImage, newItem: MediaStoreImage) =
                oldItem == newItem
        }
    }
}