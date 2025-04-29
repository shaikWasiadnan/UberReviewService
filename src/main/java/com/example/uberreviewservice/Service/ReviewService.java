package com.example.uberreviewservice.Service;

import com.example.uberreviewservice.Repository.ReviewRepository;
import com.example.uberreviewservice.models.Review;
import lombok.Builder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {
    private ReviewRepository reviewRepository;
    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository=reviewRepository;

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("********************");
        Review r= Review.builder().content("Amazing content from addy").rating(5.0).build();
        System.out.println(r);
        reviewRepository.save(r);

        List<Review> reviews=reviewRepository.findAll();
        for(Review review:reviews){
            System.out.println(r.getContent());
        }
    }
}
