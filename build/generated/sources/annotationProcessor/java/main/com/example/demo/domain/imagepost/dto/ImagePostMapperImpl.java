package com.example.demo.domain.imagepost.dto;

import com.example.demo.domain.imagepost.ImagePost;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-22T11:51:10+0200",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class ImagePostMapperImpl implements ImagePostMapper {

    @Override
    public ImagePost fromDTO(ImagePostDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ImagePost imagePost = new ImagePost();

        imagePost.setId( dto.getId() );
        imagePost.setImage( dto.getImage() );
        imagePost.setDescription( dto.getDescription() );
        imagePost.setLikes( dto.getLikes() );
        imagePost.setAuthor( dto.getAuthor() );

        return imagePost;
    }

    @Override
    public List<ImagePost> fromDTOs(List<ImagePostDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<ImagePost> list = new ArrayList<ImagePost>( dtos.size() );
        for ( ImagePostDTO imagePostDTO : dtos ) {
            list.add( fromDTO( imagePostDTO ) );
        }

        return list;
    }

    @Override
    public Set<ImagePost> fromDTOs(Set<ImagePostDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<ImagePost> set = new LinkedHashSet<ImagePost>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( ImagePostDTO imagePostDTO : dtos ) {
            set.add( fromDTO( imagePostDTO ) );
        }

        return set;
    }

    @Override
    public ImagePostDTO toDTO(ImagePost BO) {
        if ( BO == null ) {
            return null;
        }

        ImagePostDTO imagePostDTO = new ImagePostDTO();

        imagePostDTO.setId( BO.getId() );
        imagePostDTO.setImage( BO.getImage() );
        imagePostDTO.setDescription( BO.getDescription() );
        imagePostDTO.setLikes( BO.getLikes() );
        imagePostDTO.setAuthor( BO.getAuthor() );

        return imagePostDTO;
    }

    @Override
    public List<ImagePostDTO> toDTOs(List<ImagePost> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<ImagePostDTO> list = new ArrayList<ImagePostDTO>( BOs.size() );
        for ( ImagePost imagePost : BOs ) {
            list.add( toDTO( imagePost ) );
        }

        return list;
    }

    @Override
    public Set<ImagePostDTO> toDTOs(Set<ImagePost> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<ImagePostDTO> set = new LinkedHashSet<ImagePostDTO>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( ImagePost imagePost : BOs ) {
            set.add( toDTO( imagePost ) );
        }

        return set;
    }
}
