package com.eventify.service;

import com.eventify.entity.ReviewEntity;
import com.eventify.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<ReviewEntity> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Optional<ReviewEntity> getReviewById(Long id) {
        return reviewRepository.findById(id);
    }

    public ReviewEntity createReview(ReviewEntity review) {
        return reviewRepository.save(review);
    }

    public ReviewEntity updateReview(Long id, ReviewEntity reviewDetails) {
        Optional<ReviewEntity> optionalReview = reviewRepository.findById(id);
        if (optionalReview.isPresent()) {
            ReviewEntity review = optionalReview.get();
            // Update attributes here
            return reviewRepository.save(review);
        }
        return null; // Handle not found case
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}
