package com.example.demo.domain.user.dto;

import com.example.demo.domain.authority.Authority;
import com.example.demo.domain.authority.dto.AuthorityDTO;
import com.example.demo.domain.imagepost.ImagePost;
import com.example.demo.domain.imagepost.dto.ImagePostDTO;
import com.example.demo.domain.role.Role;
import com.example.demo.domain.role.dto.RoleDTO;
import com.example.demo.domain.user.User;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-11T13:32:28+0200",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8.1 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User fromDTO(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setId( dto.getId() );
        user.setFirstName( dto.getFirstName() );
        user.setLastName( dto.getLastName() );
        user.setEmail( dto.getEmail() );
        user.setRoles( roleDTOSetToRoleSet( dto.getRoles() ) );
        user.setImagePosts( imagePostDTOListToImagePostList( dto.getImagePosts() ) );

        return user;
    }

    @Override
    public List<User> fromDTOs(List<UserDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( dtos.size() );
        for ( UserDTO userDTO : dtos ) {
            list.add( fromDTO( userDTO ) );
        }

        return list;
    }

    @Override
    public Set<User> fromDTOs(Set<UserDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<User> set = new LinkedHashSet<User>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( UserDTO userDTO : dtos ) {
            set.add( fromDTO( userDTO ) );
        }

        return set;
    }

    @Override
    public UserDTO toDTO(User BO) {
        if ( BO == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( BO.getId() );
        userDTO.setFirstName( BO.getFirstName() );
        userDTO.setLastName( BO.getLastName() );
        userDTO.setEmail( BO.getEmail() );
        userDTO.setRoles( roleSetToRoleDTOSet( BO.getRoles() ) );
        userDTO.setImagePosts( imagePostListToImagePostDTOList( BO.getImagePosts() ) );

        return userDTO;
    }

    @Override
    public List<UserDTO> toDTOs(List<User> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( BOs.size() );
        for ( User user : BOs ) {
            list.add( toDTO( user ) );
        }

        return list;
    }

    @Override
    public Set<UserDTO> toDTOs(Set<User> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<UserDTO> set = new LinkedHashSet<UserDTO>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( User user : BOs ) {
            set.add( toDTO( user ) );
        }

        return set;
    }

    @Override
    public User fromUserRegisterDTO(UserRegisterDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setId( dto.getId() );
        user.setFirstName( dto.getFirstName() );
        user.setLastName( dto.getLastName() );
        user.setEmail( dto.getEmail() );
        user.setPassword( dto.getPassword() );

        return user;
    }

    protected Authority authorityDTOToAuthority(AuthorityDTO authorityDTO) {
        if ( authorityDTO == null ) {
            return null;
        }

        Authority authority = new Authority();

        authority.setId( authorityDTO.getId() );
        authority.setName( authorityDTO.getName() );

        return authority;
    }

    protected Set<Authority> authorityDTOSetToAuthoritySet(Set<AuthorityDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Authority> set1 = new LinkedHashSet<Authority>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( AuthorityDTO authorityDTO : set ) {
            set1.add( authorityDTOToAuthority( authorityDTO ) );
        }

        return set1;
    }

    protected Role roleDTOToRole(RoleDTO roleDTO) {
        if ( roleDTO == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( roleDTO.getId() );
        role.setName( roleDTO.getName() );
        role.setAuthorities( authorityDTOSetToAuthoritySet( roleDTO.getAuthorities() ) );

        return role;
    }

    protected Set<Role> roleDTOSetToRoleSet(Set<RoleDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Role> set1 = new LinkedHashSet<Role>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( RoleDTO roleDTO : set ) {
            set1.add( roleDTOToRole( roleDTO ) );
        }

        return set1;
    }

    protected ImagePost imagePostDTOToImagePost(ImagePostDTO imagePostDTO) {
        if ( imagePostDTO == null ) {
            return null;
        }

        ImagePost imagePost = new ImagePost();

        imagePost.setId( imagePostDTO.getId() );
        imagePost.setImage( imagePostDTO.getImage() );
        imagePost.setDescription( imagePostDTO.getDescription() );
        imagePost.setLikes( imagePostDTO.getLikes() );
        imagePost.setAuthor( imagePostDTO.getAuthor() );

        return imagePost;
    }

    protected List<ImagePost> imagePostDTOListToImagePostList(List<ImagePostDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<ImagePost> list1 = new ArrayList<ImagePost>( list.size() );
        for ( ImagePostDTO imagePostDTO : list ) {
            list1.add( imagePostDTOToImagePost( imagePostDTO ) );
        }

        return list1;
    }

    protected AuthorityDTO authorityToAuthorityDTO(Authority authority) {
        if ( authority == null ) {
            return null;
        }

        AuthorityDTO authorityDTO = new AuthorityDTO();

        authorityDTO.setId( authority.getId() );
        authorityDTO.setName( authority.getName() );

        return authorityDTO;
    }

    protected Set<AuthorityDTO> authoritySetToAuthorityDTOSet(Set<Authority> set) {
        if ( set == null ) {
            return null;
        }

        Set<AuthorityDTO> set1 = new LinkedHashSet<AuthorityDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Authority authority : set ) {
            set1.add( authorityToAuthorityDTO( authority ) );
        }

        return set1;
    }

    protected RoleDTO roleToRoleDTO(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId( role.getId() );
        roleDTO.setName( role.getName() );
        roleDTO.setAuthorities( authoritySetToAuthorityDTOSet( role.getAuthorities() ) );

        return roleDTO;
    }

    protected Set<RoleDTO> roleSetToRoleDTOSet(Set<Role> set) {
        if ( set == null ) {
            return null;
        }

        Set<RoleDTO> set1 = new LinkedHashSet<RoleDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Role role : set ) {
            set1.add( roleToRoleDTO( role ) );
        }

        return set1;
    }

    protected ImagePostDTO imagePostToImagePostDTO(ImagePost imagePost) {
        if ( imagePost == null ) {
            return null;
        }

        ImagePostDTO imagePostDTO = new ImagePostDTO();

        imagePostDTO.setId( imagePost.getId() );
        imagePostDTO.setImage( imagePost.getImage() );
        imagePostDTO.setDescription( imagePost.getDescription() );
        imagePostDTO.setLikes( imagePost.getLikes() );
        imagePostDTO.setAuthor( imagePost.getAuthor() );

        return imagePostDTO;
    }

    protected List<ImagePostDTO> imagePostListToImagePostDTOList(List<ImagePost> list) {
        if ( list == null ) {
            return null;
        }

        List<ImagePostDTO> list1 = new ArrayList<ImagePostDTO>( list.size() );
        for ( ImagePost imagePost : list ) {
            list1.add( imagePostToImagePostDTO( imagePost ) );
        }

        return list1;
    }
}
