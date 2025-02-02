package io.filmtime.data.api.trakt

import io.filmtime.data.model.GeneralError
import io.filmtime.data.model.Result

enum class TmdbType {
  MOVIE,
  SHOW,
//  EPISODE,
//  PERSON,
}

interface TraktSearchRemoteSource {

  suspend fun getByTmdbId(id: Int, type: TmdbType? = null): Result<Int, GeneralError>
}
