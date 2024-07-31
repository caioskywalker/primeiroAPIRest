package dio.web.api.repositorio;

import java.util.List;
import java.util.ArrayList;

import dio.web.api.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserReposiTory {

	List<Usuario> usuarioList = new ArrayList<Usuario>();

	public UserReposiTory(List<Usuario> usuarioList) {
		this.usuarioList = usuarioList;
	}

	public void save(Usuario usuario) {
		try {
			if (usuario.getId() == null) {
				throw new Exception("Usuario precisa de id");
			} else {
				usuarioList.add(usuario);
				System.out.println("Usuario adicionado com sucesso");
			}
		} catch (Exception e) {
			System.err.println("Erro ao adicionar usuário: " + e.getMessage());
		}
	}

	public void deleteById(Integer id) {
		Usuario userToRemove = usuarioList.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(null);

		try {
			if (userToRemove.getId() == null) {
				throw new Exception("Usuario precisa de id");
			} else {
				usuarioList.remove(userToRemove);
			}
		} catch (Exception e) {
			System.err.println("Erro ao deletar usuário: " + e.getMessage());
		}

	}

	public List<Usuario> findAll() {
		System.out.println("LIST - Listando os usários do sistema");
		return usuarioList;
	}

	public Usuario findById(Integer id) {
		System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
		Usuario userEncontrado = usuarioList.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(null);
		return userEncontrado;
	}

	public Usuario findByUsername(String username) {
		System.out.println(
				String.format("FIND/username - Recebendo o usernamae: %s para localizar um usuário", username));
		Usuario userEncontrado = usuarioList.stream().filter(u -> u.getLogin().equals(username)).findFirst().orElse(null);
		return userEncontrado;
	}

}
