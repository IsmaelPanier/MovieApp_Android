package com.ynov.movieappv2.tvshows.data.dto

import com.ynov.movieappv2.tvshows.domain.model.PopularShow

data class PopularShowsResponse(
    val total: Int,
    val page: Int,
    val tv_shows: List<PopularShowDto>
)

data class PopularShowDto(
    val id: Int,
    val name: String,
    val permalink: String,
    val start_date: String?,
    val country: String?,
    val network: String?,
    val status: String?,
    val image_thumbnail_path: String
)

fun PopularShowDto.toPopularShow(): PopularShow {
    return PopularShow(
        id = this.id,
        name = this.name,
        thumbnailUrl = this.image_thumbnail_path
    )
}
