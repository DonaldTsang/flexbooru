/*
 * Copyright (C) 2019. by onlymash <im@fiepi.me>, All rights reserved
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */

package onlymash.flexbooru.entity.tag

import com.google.gson.annotations.SerializedName

data class TagSankaku(
    @SerializedName("child_tags")
    val child_tags: String?,
    @SerializedName("count")
    val count: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("locale")
    val locale: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("name_en")
    val name_en: String,
    @SerializedName("name_ja")
    val name_ja: String,
    @SerializedName("parent_tags")
    val parent_tags: String?,
    @SerializedName("rating")
    val rating: String?,
    @SerializedName("related_tags")
    val related_tags: String?,
    @SerializedName("type")
    val type: Int
) : TagBase() {
    override fun getTagId(): Int = id
    override fun getTagName(): String = name
}