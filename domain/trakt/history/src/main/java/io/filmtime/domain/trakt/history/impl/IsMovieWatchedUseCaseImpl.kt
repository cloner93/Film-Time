package io.filmtime.domain.trakt.history.impl

import io.filmtime.data.model.GeneralError
import io.filmtime.data.model.Result
import io.filmtime.data.model.TraktHistory
import io.filmtime.data.trakt.TraktHistoryRepository
import io.filmtime.domain.trakt.history.IsMovieWatchedUseCase
import javax.inject.Inject

internal class IsMovieWatchedUseCaseImpl @Inject constructor(
  private val traktHistoryRepository: TraktHistoryRepository,
) : IsMovieWatchedUseCase {

  override suspend fun invoke(tmdbId: Int): Result<TraktHistory, GeneralError> =
    traktHistoryRepository.isWatched(tmdbId)
}
