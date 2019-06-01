package com.eihror.tanamesa.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GlideImageUtil {

    private lateinit var _context: Context

    fun initImageLoader(context: Context){
        _context = context
    }

    fun setData(
        imageOnLoading: Int?,
        imageOnFail: Int?
    ) {
        imageOnLoading?.let { setImageOnLoading(it) }
        imageOnFail?.let { setImageOnFail(it) }
    }

    private fun setImageOnLoading(imageOnLoading: Int) {
        _imageOnLoading = imageOnLoading
    }

    private fun setImageOnFail(imageOnFail: Int) {
        _imageOnFail = imageOnFail
    }

    fun loadImage(
        imageUrl: String?,
        imageView: ImageView,
        isCircularDisplayer: Boolean = false
    ) {
        if(isCircularDisplayer){
            Glide
                .with(_context)
                .load(imageUrl)
                .centerCrop()
                .apply(RequestOptions.circleCropTransform())
                .placeholder(_imageOnLoading)
                .error(_imageOnFail)
                .into(imageView)
        }else{
            Glide
                .with(_context)
                .load(imageUrl)
                .centerCrop()
                .placeholder(_imageOnLoading)
                .error(_imageOnFail)
                .into(imageView)
        }
    }

    companion object {
        private var _imageOnLoading: Int = -1
        private var _imageOnFail: Int = -1

    }

}