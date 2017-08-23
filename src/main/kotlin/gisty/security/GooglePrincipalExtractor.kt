package gisty.security

import gisty.domain.repository.socialprofile.SocialProfileRepository
import gisty.domain.repository.user.UserRepository

class GooglePrincipalExtractor(userRepository: UserRepository,
                               socialProfileRepository: SocialProfileRepository):
        OAuthPrincipalExtractor(userRepository, socialProfileRepository) {
    override val provider = "google"
}