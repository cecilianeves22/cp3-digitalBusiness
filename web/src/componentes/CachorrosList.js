import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';

const CachorroList = () => {
  const [cachorros, setcachorros] = useState([
  ]);

  useEffect(() => {
    fetchCachorros();
  }, []);

  const fetchCachorros = async () => {
    try {
      const response = await axios.get('http://localhost:8080/api/cachorros');
      setcachorros(response.data);
    } catch (error) {
      console.error(error);
    }
  };

  const deleteCachorro = async (nome) => {
    try {
      await axios.delete(`http://localhost:8080/api/cachorrosDelete/${nome}`);
      fetchCachorros();
    } catch (error) {
      console.error(error);
    }
  };

  return (
    <div>
      <h1>Lista de Cachorros</h1>
      <table>
        <thead>
          <tr>
            <th>Nome</th>
            <th>Raça</th>
            <th>Sexo</th>
            <th>Data de Cadastro</th>
            <th>Data de Atualização</th>
          </tr>
        </thead>

        {cachorros.length ? <tbody>
          {cachorros.map((dog) => (
            <tr key={dog.nome}>
              <td>{dog.nome}</td>
              <td>{dog.raca}</td>
              <td>{dog.sexo}</td>
              <td>{dog.cadastro}</td>
              <td>{dog.atualizacao}</td>
              <td>
                <Link to={`/edit/${dog.nome}`}>Editar</Link>
              </td>
              <td>
                <button onClick={() => deleteCachorro(dog.nome)}>Deletar</button>
              </td>
            </tr>
          ))}
        </tbody>
          : <p style={{ textAlign: 'center' }}>Nenhum cachorro encontrado</p>}
      </table>
      <Link to="/create">Criar Cachorros</Link>
    </div>
  );
};

export default CachorroList;